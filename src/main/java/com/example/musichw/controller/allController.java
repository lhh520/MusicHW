package com.example.musichw.controller;
import com.example.musichw.service.MessageService;
import com.example.musichw.service.MusicService;
import com.example.musichw.service.UserdetailsService;
import com.example.musichw.service.UsersongService;
import com.github.pagehelper.PageInfo;
import java.util.*;
import java.sql.Blob.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import java.beans.Beans;
import org.springframework.http.ResponseEntity;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.Arrays;
import java.nio.*;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Set;
import org.springframework.web.bind.annotation.RequestMapping;
import java.awt.*;
import org.springframework.web.bind.annotation.RestController;
import java.security.acl.Acl;
import com.example.musichw.pojo.*;
import java.util.List;
import javax.servlet.http.HttpSession;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.applet.*;

 
@RestController
@RequestMapping("/music")
public class allController {
    @Autowired
    MusicService musicService;
    @Autowired
    UserdetailsService userdetailsService;
    @Autowired
    UsersongService usersongService;
    @Autowired
    MessageService messageService;
    @PostMapping("/ALLsongs")
    public ResponseEntity<PageInfo<Music>> findAllMusic(@RequestBody page page) {
        PageInfo<Music> returns = musicService.gettotal(page.getPagenum(),page.getPagesize());
        return ResponseEntity.ok(returns);
    }

    @PostMapping("/SongsbyID")
    public ResponseEntity<PageInfo<Music>> SongsbyID(@RequestBody page page, HttpSession session) {
        Integer uerrid= (Integer) session.getAttribute("userID");
        Usersong usersong=new Usersong();
        usersong.setUsercode(uerrid);
        PageInfo<Usersong> rests = usersongService.getAllUserSongs(page.getPagenum(),page.getPagesize(),uerrid);
        List<Integer> asas=new ArrayList<>();
        List<Usersong>res=rests.getList();
        for(Usersong uu:res){
            asas.add(uu.getSongcode());
        }
        PageInfo<Music> ress = musicService.getBatches(page.getPagenum(),page.getPagesize(),asas);
        return ResponseEntity.ok(ress);
    }

    public MusicService getMusicService() {
        return musicService;
    }

    public UserdetailsService getUserdetailsService() {
        return userdetailsService;
    }

    public UsersongService getUsersongService() {
        return usersongService;
    }

    public MessageService getMessageService() {
        return messageService;
    }

    @PostMapping("/getALLMessae")
    public ResponseEntity<PageInfo<Message>> getALLMessae(@RequestBody page page, HttpSession session) {
        Integer uid= (Integer) session.getAttribute("userID");
        Message message=new Message();
        Integer ii=0;
        System.out.println(ii.equals(new Integer(3)));
        message.setVisitor(uid);
        Map<Integer,Integer>map=new HashMap<>();
        map.put(new Integer(1),new Integer(2));
        PageInfo<Message> pageInfo = messageService.getmessages(page.getPagenum(),page.getPagesize(),uid);
        map.put(new Integer(2),new Integer(2));
        return ResponseEntity.ok(pageInfo);
    }
    @PostMapping("/getMusic")
    public ResponseEntity<PageInfo<Music>> getMusic(@RequestBody page pages){
        Integer num = pages.getPagenum();
        Integer size = pages.getPagesize();
        String content = pages.getQueryInfo();
        PageInfo<Music> txt = musicService.getbymusicname(num, size, content);
        for(int ii=0;ii<100;ii++){
            System.out.println(ii);
        }
        Queue queue=new LinkedList();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        return ResponseEntity.ok(txt);
    }

    @Override
    public String toString() {
        return "allController{" +
                "musicService=" + musicService +
                ", userdetailsService=" + userdetailsService +
                ", usersongService=" + usersongService +
                ", messageService=" + messageService +
                '}';
    }

    @PostMapping("/musicList")
    public ResponseEntity<PageInfo<Music>> musicList(@RequestBody page yuu) {
        Integer unicode= Integer.valueOf(yuu.getQueryInfo());
        List<Integer>list=new ArrayList<>();
        list.add(new Integer(1));
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        map.put(1,2);
        map.put(1,3);
        map.put(1,4);
        Usersong usersong=new Usersong();
        usersong.setUsercode(unicode);
        PageInfo<Usersong> pageInfo = usersongService.getAllUserSongs(yuu.getPagenum(),yuu.getPagesize(),unicode);
        List<Integer> uuns=new ArrayList<>();
        List<Usersong>res=pageInfo.getList();
        Map<Integer,Usersong>map1=new HashMap<>();
        for(Usersong cddc:res){
            map1.put(new Integer(1),cddc);
            uuns.add(cddc.getSongcode());
            map.put(new Integer(2),new Integer(2));
        }
        if(uuns.size()==0){
            map.clear();
            PageInfo<Music> ssss=new PageInfo<>();
            map1.clear();
            return ResponseEntity.ok(ssss);
        }
        PageInfo<Music> pageInfos = musicService.getBatches(yuu.getPagenum(),yuu.getPagesize(),uuns);
        return ResponseEntity.ok(pageInfos);
    }
    @PostMapping("/insertmusic")
    public ResponseEntity<PageInfo<Music>> insertmusic(@RequestBody Map<String, Integer> map, HttpSession sessionssss) {

        Queue<Integer>queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.poll();
        queue.poll();
        Usersong usersong=new Usersong();
        usersong.setUsercode((Integer) sessionssss.getAttribute("userID"));
        usersong.setSongcode(map.get("id"));
        usersongService.insertSong(usersong);
        return null;

    }

    @PostMapping("/DelUserSong")
    public ResponseEntity<Void> DelUserSong(@RequestBody Map<String, Integer> map, HttpSession seii){
        int uid=(Integer) seii.getAttribute("userID");
        int sid=(Integer)map.get("id");
        Queue<Integer>queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.poll();
        queue.poll();
        usersongService.deleteSong(uid,sid);
        Queue<Integer>queue2=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.poll();
        queue.poll();
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @PostMapping("/getAllusers")
    public ResponseEntity<PageInfo<Userdetails>> getAllusers(@RequestBody page page) {
        PageInfo<Userdetails>dsdds=userdetailsService.getAllUserdetails(page.getPagenum(),page.getPagesize());
        Queue<Integer>queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.poll();
        queue.poll();
        List<Integer>list=new ArrayList<>();
        list.add(new Integer(1));
        return ResponseEntity.ok(dsdds);
    }

    public allController() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @PostMapping("/getALLcommnet")
    public ResponseEntity<Void> getALLcommnet(@RequestBody page page, HttpSession sessionssss){
        System.out.println("______________");
        System.out.println(page.toString());
        System.out.println("______________");
        Message message=new Message();
        List<Integer>list=new ArrayList<>();
        for(int ii=0;ii<100;ii++){
            System.out.println(ii);
        }
        message.setId((int)(Math.random()*100000000));
        list.add(new Integer(1));
        message.setVisitor(page.getPagenum());
        for(int ii:list){
            System.out.println(ii);
            System.out.println("Im not here");
        }
        message.setMsg(page.getQueryInfo());
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(4));
        messageService.insertMessage(message);
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(new Integer(6));
        List<Integer>list1=new ArrayList<>();
        list1.add(9999);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}

