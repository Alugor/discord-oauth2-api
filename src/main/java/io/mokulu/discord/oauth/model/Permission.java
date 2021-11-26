package io.mokulu.discord.oauth.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Permission
{
    CREATE_INSTANT_INVITE(0x00000001),
    KICK_MEMBERS(0x00000002),
    BAN_MEMBERS(0x00000004),
    ADMINISTRATOR(0x00000008),
    MANAGE_CHANNELS(0x00000010),
    MANAGE_GUILD(0x00000020),
    ADD_REACTIONS(0x00000040),
    VIEW_AUDIT_LOG(0x00000080),
    VIEW_CHANNEL(0x00000400),
    SEND_MESSAGES(0x00000800),
    SEND_TTS_MESSAGES(0x00001000),
    MANAGE_MESSAGES(0x00002000),
    EMBED_LINKS(0x00004000),
    ATTACH_FILES(0x00008000),
    READ_MESSAGE_HISTORY(0x00010000),
    MENTION_EVERYONE(0x00020000),
    USE_EXTERNAL_EMOJIS(0x00040000),
    CONNECT(0x00100000),
    SPEAK(0x00200000),
    MUTE_MEMBERS(0x00400000),
    DEAFEN_MEMBERS(0x00800000),
    MOVE_MEMBERS(0x01000000),
    USE_VAD(0x02000000),
    PRIORITY_SPEAKER(0x00000100),
    STREAM(0x00000200),
    CHANGE_NICKNAME(0x04000000),
    MANAGE_NICKNAMES(0x08000000),
    MANAGE_ROLES(0x10000000),
    MANAGE_WEBHOOKS(0x20000000),
    @Deprecated
    MANAGE_EMOJIS(0x40000000),
    MANAGE_EMOJIS_AND_STICKERS(0x0040000000),
    USE_APPLICATION_COMMANDS(0x0080000000),
    REQUEST_TO_SPEAK(0x0100000000L),
    MANAGE_EVENTS(0x0200000000L),
    MANAGE_THREADS(0x0400000000L),
    CREATE_PUBLIC_THREADS(0x0800000000L),
    CREATE_PRIVATE_THREADS(0x1000000000L),
    USE_EXTERNAL_STICKERS(0x2000000000L),
    SEND_MESSAGES_IN_THREADS(0x4000000000L),
    START_EMBEDDED_ACTIVITIES(0x8000000000L),
    ;

    @Getter
    private final long value;

    boolean isIn(long permissions)
    {
        return (permissions & value) == value;
    }

    @Deprecated
    long value()
    {
        return value;
    }
}
