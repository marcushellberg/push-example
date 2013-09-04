package com.vaadin.training;

import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.shared.communication.PushMode;
import com.vaadin.ui.UI;

import javax.servlet.annotation.WebServlet;

@Theme("mytheme")
@SuppressWarnings("serial")
@Push(PushMode.AUTOMATIC)
public class ScrumBoardUI extends UI {

    @WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = ScrumBoardUI.class, widgetset = "com.vaadin.DefaultWidgetSet")
    public static class Servlet extends VaadinServlet {
    }

    @Override
    protected void init(VaadinRequest request) {
        setContent(new ScrumBoardLayout());
    }

}
