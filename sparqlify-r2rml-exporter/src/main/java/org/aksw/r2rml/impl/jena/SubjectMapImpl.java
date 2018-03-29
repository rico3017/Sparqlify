/**
 * 
 */
package org.aksw.r2rml.impl.jena;

import java.util.Set;

import org.aksw.r2rml.api.SubjectMap;
import org.apache.jena.enhanced.EnhGraph;
import org.apache.jena.graph.Node;
import org.apache.jena.rdf.model.Resource;

public class SubjectMapImpl
	extends TermMapImpl
	implements SubjectMap
{
	public SubjectMapImpl(Node node, EnhGraph graph) {
		super(node, graph);
	}

	@Override
	public Set<Resource> getTypes() {
		Set<Resource> result = new SetFromResourceAndProperty<>(this, RR.rrClass, Resource.class);
		return result;
	}
}