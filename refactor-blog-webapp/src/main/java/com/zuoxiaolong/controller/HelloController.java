/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zuoxiaolong.controller;

import com.zuoxiaolong.http.life.api.annotation.EnableDoc;
import com.zuoxiaolong.http.life.api.annotation.ParamDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xiaolong Zuo
 */
@RestController
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/")
    @EnableDoc
    @ParamDoc(name = "name1111", decription = "这是一个随便的参数")
    public String hello(@RequestParam(name = "name1111", defaultValue = "iniansidsd") String name) {
        return name;
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class);
    }

}
