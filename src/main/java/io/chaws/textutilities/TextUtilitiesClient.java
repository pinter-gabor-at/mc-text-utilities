package io.chaws.textutilities;

import io.chaws.textutilities.handlers.FormatButtonsHandler;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class TextUtilitiesClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		if (!TextUtilities.enabled) {
			TextUtilities.logger.warn("Skipping client initialization because mod is disabled.");
			return;
		}

		FormatButtonsHandler.initialize();
	}
}