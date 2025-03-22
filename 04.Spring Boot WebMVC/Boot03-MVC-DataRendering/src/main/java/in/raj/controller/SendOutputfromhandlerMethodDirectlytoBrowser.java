package in.raj.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.PrintWriter;
import java.util.Map;

@Controller
public class SendOutputfromhandlerMethodDirectlytoBrowser {


    @RequestMapping("/without")
    public void process(HttpServletResponse res) throws Exception{
        // Get PrintWriter
        PrintWriter pw = res.getWriter();
        //Set response content type
        res.setContentType("text/html");
        //Write data to browser s/w
        pw.println("<h1>Directly from handler method</h1>");
    }
}
