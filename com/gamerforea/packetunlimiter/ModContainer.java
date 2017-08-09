package com.gamerforea.packetunlimiter;

import com.google.common.eventbus.EventBus;
import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.ModMetadata;

public final class ModContainer extends DummyModContainer {
   private final ModMetadata meta = new ModMetadata();

   public ModContainer() {
      this.meta.autogenerated = false;
      this.meta.authorList.add("gamerforEA");
      this.meta.credits = "Created by gamerforEA.";
      this.meta.modId = this.getModId();
      this.meta.name = this.getName();
      this.meta.version = this.getVersion();
   }

   public boolean registerBus(EventBus bus, LoadController controller) {
      return true;
   }

   public String getModId() {
      return "PacketUnlimiter";
   }

   public String getName() {
      return "PacketUnlimiter";
   }

   public String getVersion() {
      return "1.1";
   }

   public String getDisplayVersion() {
      return this.getVersion();
   }

   public ModMetadata getMetadata() {
      return this.meta;
   }
}
