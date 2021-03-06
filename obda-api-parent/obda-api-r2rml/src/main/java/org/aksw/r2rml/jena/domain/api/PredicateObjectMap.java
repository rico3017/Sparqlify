package org.aksw.r2rml.jena.domain.api;

import java.util.Set;

import org.apache.jena.rdf.model.Resource;

public interface PredicateObjectMap
	extends MappingComponent
{
	Set<GraphMap> getGraphMaps();
	Set<Resource> getPredicates();
	Set<PredicateMap> getPredicateMaps();
	Set<ObjectMap> getObjectMaps();

	
//	Resource getPredicate();
//	PredicateObjectMap setPredicate(Resource predicate);
//
//	TermMap getPredicateMap();
//	PredicateObjectMap setPredicateMap(TermMap termMap);
//	
//	TermMap getObjectMap();
//	PredicateObjectMap setObjectMap(TermMap termMap);
}
