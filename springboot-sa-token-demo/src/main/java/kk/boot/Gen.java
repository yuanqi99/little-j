package kk.boot;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.nio.file.Paths;

/**
 * @Author: 山居
 * @CreateTime: 2024-08-11
 * @Description:
 * @Version: 1.0
 */

public class Gen
{
    public static void main(String[] args)
    {
        FastAutoGenerator.create("jdbc:mysql://xxxx:3306/ipd?serverTimezone=GMT%2B8&useUnicode=true&" +
                        "", "ipd", "DHh3tMSXR2ZMKttj")
                .globalConfig(builder -> builder
                        .author("shan")
                        .outputDir(Paths.get(System.getProperty("user.dir")) + "/src/main/java")
                        .commentDate("yyyy-MM-dd")
                )
                .packageConfig(builder -> builder
                        .parent("kk.boot.sys")
                        .entity("entity")
                        .mapper("mapping")
                        .service("service")
                        .serviceImpl("service.impl")
                        .xml("mapper.xml")
                )
                .strategyConfig(builder -> builder
                        .addInclude("sys_user")
                )
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
