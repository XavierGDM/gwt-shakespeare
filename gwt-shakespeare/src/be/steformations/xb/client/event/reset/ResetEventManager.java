package be.steformations.xb.client.event.reset;

import com.google.gwt.event.shared.EventHandler;

public interface ResetEventManager extends EventHandler{

	public void onReset(ResetEvent event);
	
}
