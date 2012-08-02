/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.java.btrace.agent.commands;

import net.java.btrace.api.wireio.Command;
import net.java.btrace.api.wireio.CommandContext;
import net.java.btrace.spi.wireio.CommandImpl;
import net.java.btrace.wireio.Session;
import net.java.btrace.wireio.commands.EventCommand;




/**
 *
 * @author Jaroslav Bachorik
 */
@Command(clazz=EventCommand.class)
public class EventCommandImpl extends CommandImpl<EventCommand> {
    @Override
    public void execute(CommandContext ctx, EventCommand cmd) {
        Session s = ctx.lookup(Session.class);
        s.event(cmd.getEvent());
    }
}
