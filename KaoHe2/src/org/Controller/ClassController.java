package org.Controller;

import org.Service.ClassService;
import org.domain.Classroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/items")
public class ClassController {

    @Autowired//注入service对象
    private ClassService classService;

    //增
    @RequestMapping("add")
    public String add(Classroom cr){
        classService.add(cr);
        return "redirect: /items/allFind.do";
    }

    //删
    @RequestMapping("delete")
    public String delete(String id){
        classService.delete(id);
        return  "redirect: /items/allFind.do";
    }

    //1改
    @RequestMapping("updata1")
    public String updata1(Model model,String id){
        Classroom cr = classService.idFind(id);
        System.out.println(cr.getStu());
        model.addAttribute("cr",cr);
        return "update";
    }

    //2改
    @RequestMapping("updata2")
    public String updata2(Classroom cr){
        System.out.println(cr.getStu());
        classService.update(cr);
        return  "redirect: /items/allFind.do";
    }

    //id查
    @RequestMapping("idFind")
    public String idFind(Model model,String id){
        Classroom cr = classService.idFind(id);
        model.addAttribute("Classroom",cr);
        return "idFind2";
    }

    //全查
    @RequestMapping("allFind")
    public String allFind(Model model){
        List<Classroom> list = classService.AllFind();
        model.addAttribute("list",list);
        return "list";
    }
}
