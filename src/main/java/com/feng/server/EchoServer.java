package com.feng.server;


import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.util.logging.Logger;

/**
 * @author f
 * @date 2023/5/7 21:40
 */
@ServerEndpoint("/echo")
public class EchoServer {

    private static final Logger logger = Logger.getLogger(EchoServer.class.getName());

    @OnOpen
    public void onOpen(Session session) {
        System.out.println("Connected to endpoint: " + session.getId());
    }

    @OnMessage
    public void onMessage(String message, Session session) {
        System.out.println("Received message: " + message);
        session.getAsyncRemote().sendText("Echo: " + message);
    }

    @OnError
    public void onError(Throwable t) {
        logger.severe(t.getMessage());
    }

    @OnClose
    public void onClose(Session session, CloseReason reason) {
        System.out.println("Session closed: " + reason.getReasonPhrase());
    }
}
