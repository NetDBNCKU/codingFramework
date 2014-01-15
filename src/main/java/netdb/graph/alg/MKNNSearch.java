package netdb.graph.alg;

import netdb.graph.opts.framework.Target;
import netdb.graph.opts.framework.Walker;

import com.tinkerpop.blueprints.Vertex;

import java.util.*;
public class MKNNSearch implements IGraphSearchStrategy {
    private TreeSet<Target> knnCandidate;
    private IGraphSearchVisitor Ivisitor;
    
    public MKNNSearch(){
    	knnCandidate = new TreeSet<Target>();
    }
    
    
	public List<Vertex> getNextVisitVertex(Vertex v, Walker walker) {
		// calculate the probability of walking to or not walking to v's neighbors
		
		return null;
	}

	public void accept(IGraphSearchVisitor vis) {
		Ivisitor = vis;
		
	}
    
	


}
