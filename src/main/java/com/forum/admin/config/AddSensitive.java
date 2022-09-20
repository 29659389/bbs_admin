package com.forum.admin.config;

import com.forum.admin.service.Impl.SensitiveServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.RandomAccessFile;

@Controller
public class AddSensitive {
    @Autowired
    private SensitiveServiceImpl service;
    @RequestMapping(path = "/AddSensitive")
    @ResponseBody
    public Integer AddSensitive(String context)  {
        /*
        * 将前段传入的违规词添加到数据库中，并在本地文件中进行更新
        * */

        //获取文件绝对地址
        String fileName="D:\\Git\\admin\\src\\main\\resources\\static\\CensorWords.txt";
        try {
            // 打开一个随机访问文件流，按读写方式
            RandomAccessFile randomFile = new RandomAccessFile(fileName, "rw");
            // 文件长度，字节数
            long fileLength = randomFile.length();
            // 将写文件指针移到文件尾。
            randomFile.seek(fileLength);
            randomFile.write((context+"\r\n").toString().getBytes());
            randomFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Integer result= service.addSst(context);

        return result;
    }
}
