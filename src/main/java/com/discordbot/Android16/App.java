package com.discordbot.Android16;

import java.io.File;

import com.discordbot.Android16.App;
import com.discordbot.Android16.Ref;
import com.jagrosh.jdautilities.commons.*;
import com.jagrosh.jdautilities.commons.waiter.EventWaiter;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;




public class App extends ListenerAdapter
{
    public static void main( String[] args ) throws Exception
    {
        JDA Android16 = new JDABuilder(AccountType.BOT).setToken(Ref.token).buildBlocking();
        Android16.addEventListener(new App());
        
        
        
    }
    int GokuCounter = 0;
    @Override
    
    public void onMessageReceived(MessageReceivedEvent evt) 
    {	//objects//
    	User objUser = evt.getAuthor();
    	MessageChannel objMsgCh = evt.getChannel();
    	Message objMsg = evt.getMessage();

    	
    	
    	//commands//
    	
    	if ((objMsg.getContentRaw().toLowerCase().contains("goku"))&&(objUser.isBot()==false)) {
    		objMsgCh.sendMessage("KILL SON GOKU").queue();
    	}
 
    	if ((objMsg.getContentRaw().toLowerCase().contains("bird"))&&(objUser.isBot()==false)) {
    		objMsgCh.sendMessage("I like the birds").queue();
            }
    	if ((objMsg.getContentRaw().equalsIgnoreCase("!DunkGoku"))&&(objUser.isBot()==false)) {
    		objMsgCh.sendMessage("Commencing dunking...").queue();
    		GokuCounter=GokuCounter+1;
    		objMsgCh.sendMessage("Son Goku has been dunked").queue();
    		objMsgCh.sendMessage("Total Gokus dunked: "+GokuCounter).queue();
    	}
    }
    
    }
