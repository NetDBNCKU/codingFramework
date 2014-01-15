package netdb.graph.alg;

import java.util.List;

import netdb.graph.opts.framework.Walker;

import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Vertex;
/**
 * 
 * @author arvin
 * this visitor is used to update the weight on the whole path that walker pass by.
 */
public class AccumateVisitor implements IGraphSearchVisitor {
    List<Edge> edges;

	public void visitVertex(Vertex v, List<Edge> impactEdges, Walker walker) {
		
		
	}
	


}
