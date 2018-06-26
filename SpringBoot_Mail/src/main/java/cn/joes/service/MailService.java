package cn.joes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by myijoes on 2018/6/26.
 */
@Service
public class MailService {

    @Autowired
    private JavaMailSender mailSender;

    /**
     * 发送邮件
     */
    public void sendMail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("myijoes136@163.com");
        message.setTo("1060903132@qq.com");
        message.setSubject("主题：简单邮件");
        message.setText("测试邮件内容");
        mailSender.send(message);
    }

    /**
     * 发送邮件参数详解
     */
    public void sendMailDetail() throws MessagingException, FileNotFoundException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();

        File file1 = ResourceUtils.getFile("classpath:weixin.png");
        System.out.println("###### :" + file1);

        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom("myijoes136@163.com");
        helper.setTo("1060903132@qq.com");
        helper.setSubject("主题：附件 + 静态资源");
        StringBuffer sb = new StringBuffer();
        sb.append("<h1>大标题-h1</h1>")
                .append("<p style='color:#F00'>红色字</p>")
                .append("<p style='text-align:right'>右对齐</p>");
        helper.setText(sb.toString(), true);

        FileSystemResource file = new FileSystemResource(file1);
        helper.addAttachment("附件-1.png", file);
        helper.addAttachment("附件-2.png", file);
        mailSender.send(mimeMessage);
    }

    /**
     * 发送邮件参数详解(cid)
     */
    public void sendMailDetail1() throws MessagingException, FileNotFoundException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        File file1 = ResourceUtils.getFile("classpath:weixin.png");
        System.out.println("###### :" + file1);
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom("myijoes136@163.com");
        helper.setTo("1060903132@qq.com");
        helper.setSubject("主题：附件 + 静态资源");
        helper.setText("<html><body>带静态资源的邮件内容 图片:<img src='cid:picture' /></body></html>", true);
        FileSystemResource file = new FileSystemResource(file1);
        helper.addAttachment("附件-1.png", file);
        helper.addAttachment("附件-2.png", file);
        helper.addInline("picture",file1);
        mailSender.send(mimeMessage);
    }

    /**
     * 发送邮件通过模板
     */
    public void sendMailDetailWithTemplate() throws MessagingException, FileNotFoundException {

    }

}
