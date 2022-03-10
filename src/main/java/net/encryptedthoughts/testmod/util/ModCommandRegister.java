package net.encryptedthoughts.testmod.util;

import net.encryptedthoughts.testmod.command.MessageCommand;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;

public class ModCommandRegister {
    public static void registerCommands() {
        CommandRegistrationCallback.EVENT.register(MessageCommand::register);
    }
}
