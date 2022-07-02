package net.merryrogue.rhstoneredone.sound;

import net.merryrogue.rhstoneredone.StoneRedone;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

// From https://www.youtube.com/watch?v=dY4m-esNOu8&ab_channel=ModdingbyKaupenjoe

public class ModSounds
{
    // Custom sound template
    // public static SoundEvent SOUND_NAME = registerSoundEvent("sound_name");

    private static SoundEvent registerSoundEvent(String name)
    {
        Identifier id = new Identifier(StoneRedone.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
