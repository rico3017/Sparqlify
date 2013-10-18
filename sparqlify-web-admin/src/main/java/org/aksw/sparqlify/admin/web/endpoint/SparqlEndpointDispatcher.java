package org.aksw.sparqlify.admin.web.endpoint;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

import org.aksw.jena_sparql_api.core.QueryExecutionFactory;
import org.aksw.jena_sparql_api.web.SparqlEndpointBase;
import org.springframework.stereotype.Service;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;


@Service
@Path("/{path : ([^/]+)?}/sparql")
public class SparqlEndpointDispatcher
	extends SparqlEndpointBase
{
//	@Resource(name="sparqlServiceConfig")
//	private SparqlServiceManager sparqlServiceConfig;

	@Context
	private UriInfo uriInfo;
	
	@Override
	public QueryExecution createQueryExecution(Query query,
			HttpServletRequest req) {

		return null;
		
//		MultivaluedMap<String, String> params = uriInfo.getPathParameters();
//		String path = params.getFirst("path");
//		
//		QueryExecutionFactory qef = null; //sparqlServiceConfig.getServiceMap().get(path);
//		if(qef == null) {
//			throw new RuntimeException("No service registered for " + path);
//		}
//		
//		QueryExecution result = qef.createQueryExecution(query);
//		
//		return result;
	}
}
