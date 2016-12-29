package cn.zzl.Main;

import cn.zzl.dto.Film;
import cn.zzl.service.IInsertFilmMsgService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ZZL on 2016/12/28.
 */
public class TextAll {
    public static void main(String[] args) throws IOException {
            AbstractApplicationContext ax= new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
            ax.start();
            Scanner scan=new Scanner(System.in);
            System.out.println("请输入电影名称 请输入电影名称 (title):");
            String title=scan.next();
            System.out.println("请输入电影描述 请输入电影描述 (description):");
            String description=scan.next();
            System.out.println("请输入语言 ID(language_id):");
            String language_id=scan.next();
            byte b[] = language_id.getBytes();
            Film film=new Film();
            film.setTitle(title);
            film.setDescription(description);
            film.setLanguageId(b[0]);
            IInsertFilmMsgService iInsertFilmMsgService=ax.getBean(IInsertFilmMsgService.class);
            iInsertFilmMsgService.insertMsgIntoFilm(film);
            ax.close();
    }
}
