package com.demo.controller;

import com.demo.model.Todo;
import com.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {

    @Autowired
    private TodoService service ;

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                dateFormat, false));
    }

    @RequestMapping(value = "/list-todos", method = RequestMethod.GET)
    public String listTodos(ModelMap model){
        List<Todo> todosList = service.retrieveTodos("Nick");
//        Collections.sort(todosList);
        model.addAttribute("todos", todosList);
        return "list-todos";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.GET)
    public String showTodoPage(ModelMap modelMap){
        modelMap.addAttribute("todo",new Todo());
        return "todo";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.POST)
    public String addTodo(ModelMap model, @Valid Todo todo, BindingResult result){
        if(result.hasErrors()){
            return "todo";
        }
        model.clear();
        service.addTodo("Nick",todo.getDesc(), todo.getTargetDate(),todo.isDone());
        return "redirect:list-todos";
    }
    @RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
    public String deleteTodo(ModelMap model,@RequestParam int id){
        service.deleteTodo(id);
        model.clear();
        return "redirect:list-todos";
    }
    @RequestMapping(value = "/update-todo", method = RequestMethod.GET)
    public String updateTodo(ModelMap model,@RequestParam int id){
        model.clear();
        Todo todo= service.retrieveTodo(id);
        model.addAttribute("todo",todo);
        return "todo";
    }
    @RequestMapping(value = "/update-todo", method = RequestMethod.POST)
    public String updateTodo(@Valid Todo todo,ModelMap model,BindingResult result){
        if(result.hasErrors()){
            return "todo";
        }
        todo.setUser("Nick");
        service.updateTodo(todo);
        model.clear();
        return "redirect:list-todos";

    }


}
