package de.gurkenlabs.litiengine.net.client;

import java.util.function.Consumer;

import de.gurkenlabs.litiengine.ILaunchable;

public interface IPingLoop extends ILaunchable {
  public void onPingRecorded(Consumer<Long> consumer);
}
