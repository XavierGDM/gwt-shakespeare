package be.steformations.xb.client.ui.widget;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.uibinder.client.UiConstructor;

import be.steformations.xb.client.event.EventManager;
import be.steformations.xb.client.event.reset.ResetEvent;
import be.steformations.xb.client.event.reset.ResetEventManager;
import gwt.material.design.client.ui.MaterialTextBox;

public class SpeakerInput extends MaterialTextBox implements ResetEventManager{
	
	@UiConstructor
	public SpeakerInput(String label) {
		GWT.log("SpeakerInput.SpeakerInput()");
		this.setLabel(label);
		this.setText("hamlet");
		
		EventManager.getInstance().addHandler(ResetEvent.type, this);
	}

	@Override
	public void onReset(ResetEvent event) {
		GWT.log("SpeakerInput.onReset()");
		this.setText("hamlet");
	}
}
