package com.wcx.springboothello.controller;

import com.wcx.springboothello.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/10/17.
 */
@RestController
@RequestMapping(value = "/mail")
public class MailController {

    @Autowired
    private MailService mailService;

    @RequestMapping(value = "/sendMail", method = RequestMethod.POST)
    public void sendMail(@RequestParam("to") String to, @RequestParam("title") String title, @RequestParam("content") String content) {
        mailService.sendSimpleMail(to, title, content);
    }

    @RequestMapping(value = "/sendHtmlMail", method = RequestMethod.POST)
    public void sendHtmlMail(@RequestParam("to") String to, @RequestParam("title") String title, @RequestParam("content") String content) {
        content = "<html>\n" +
                "<body>\n" +
                "    <h3>hello world ! 这是一封Html邮件!</h3>\n" +
                "</body>\n" +
                "</html>";
        mailService.sendHtmlMail(to, title, content);
    }

    @RequestMapping(value = "/sendInlineResourceMail", method = RequestMethod.POST)
    public void sendInlineResourceMail(@RequestParam("to") String to, @RequestParam("title") String title, @RequestParam("content") String content) {
        //<? mailService.sendInlineResourceMail(to,title,content);
    }

    @RequestMapping(value = "/sendAttachmentsMail", method = RequestMethod.POST)
    public void sendAttachmentsMail(@RequestParam("to") String to, @RequestParam("title") String title, @RequestParam("content") String content, @RequestParam("filePath") String filePath) {
        //filePath = "http://192.168.1.186:8055/BaseServer/img/icon/keyUnit.png";
        filePath="http://192.168.1.186:8055/BaseServer/img/icon/keyUnit.png";
        mailService.sendAttachmentsMail(to, title, content, filePath);
    }


}
