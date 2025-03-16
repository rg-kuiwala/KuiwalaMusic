package com.example.music;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/music")
public class MusicServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Simulate AI music generation (replace this with actual AI logic)
        String audioUrl = "generated_music_sample.mp3";

        response.setContentType("application/json");
        response.getWriter().write("{\"audioUrl\": \"" + audioUrl + "\"}");
    }
}