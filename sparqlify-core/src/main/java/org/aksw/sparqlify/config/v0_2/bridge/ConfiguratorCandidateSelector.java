package org.aksw.sparqlify.config.v0_2.bridge;

import java.util.List;

import org.aksw.jena_sparql_api.views.CandidateViewSelector;
import org.aksw.obda.jena.domain.impl.ViewDefinition;
import org.aksw.sparqlify.config.syntax.Config;
import org.aksw.sparqlify.core.cast.EffectiveViewGenerator;
import org.aksw.sparqlify.validation.Validation;
import org.slf4j.Logger;

public class ConfiguratorCandidateSelector {
	
	// Post-process incoming view definitions, such as adding ... IS NOT NULL constraints.
	private static EffectiveViewGenerator effectiveViewGenerator = new EffectiveViewGenerator();
	
	
	// TODO Use SyntaxBridge.bridge and remove duplicated code here
	public static void configure(Config config, SyntaxBridge bridge, CandidateViewSelector<org.aksw.sparqlify.core.domain.input.ViewDefinition> candidateSelector, Logger logger) {

		
		
		for(ViewDefinition item : config.getViewDefinitions()) {
			org.aksw.sparqlify.core.domain.input.ViewDefinition virtualGraph = bridge.create(item);
			
			if(logger != null) {
				Validation.validateView(virtualGraph, logger);
			}
			//candidateSelector.addView(virtualGraph);

			
			List<org.aksw.sparqlify.core.domain.input.ViewDefinition> effectiveViewDefs =
					effectiveViewGenerator.transform(virtualGraph);
			
			
			for(org.aksw.sparqlify.core.domain.input.ViewDefinition effectiveViewDef : effectiveViewDefs) {
				
				//System.out.println("Effective View\n" + effectiveViewDef);
				
				
				candidateSelector.addView(effectiveViewDef);				
			}
			
			
		}
	}

}
