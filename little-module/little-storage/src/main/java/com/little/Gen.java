package com.little;

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
        FastAutoGenerator.create("jdbc:mysql://127.0.0.1:3306/little?serverTimezone=GMT%2B8&useUnicode=true&" +
                        "", "root", "root")
                .globalConfig(builder -> builder
                        .author("litte")
                        .outputDir(Paths.get(System.getProperty("user.dir")) + "/src/main/java")
                        .commentDate("yyyy-MM-dd")
                )
                .packageConfig(builder -> builder
                        .parent("com.little")
                        .entity("domain")
                        .mapper("mapper")
                        .service("service")
                        .serviceImpl("service.impl")
                        .xml("mapper.xml")
                )
                .strategyConfig(builder -> builder
                        .addInclude("SAT_storage_tbl")
                )
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
