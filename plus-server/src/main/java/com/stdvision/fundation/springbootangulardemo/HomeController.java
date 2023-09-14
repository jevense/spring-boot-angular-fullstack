package com.stdvision.fundation.springbootangulardemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Name: HomeController
 * <p>
 * Description:
 * <p>
 * Copyright: Copyright (c) 2023 YiChenNetwork All rights Reserved
 * <p>
 * Company: 淮安奕忱网络科技有限公司
 *
 * @author lujiewen
 * @version 1.0
 * @since 2023-09-13 17:47
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String home() {
        return "forward:/index.html";
    }
}
