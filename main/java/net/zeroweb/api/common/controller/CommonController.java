package net.zeroweb.api.common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * packageName: net.zeroweb.api.common.controller
 * fileName   : CommonController
 * author     : MinHye_Sim
 * date       : 2022-02-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-11   MinHye_Sim   최초 생성
 */
@RestController

public class CommonController {
    @GetMapping("/")
    public String now(){
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
    }
    
}
