package com.wcx.springboothello.service;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by summer on 2017/5/4.
 */
public interface MailService {

    public void sendSimpleMail(String to, String subject, String content);

    public void sendHtmlMail(String to, String subject, String content);

    public void sendAttachmentsMail(String to, String subject, String content, String filePath);

    public void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId);

}
