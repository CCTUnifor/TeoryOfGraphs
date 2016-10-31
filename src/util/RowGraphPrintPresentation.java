package util;

import interfaces.IEdge;
import interfaces.IGraph;
import interfaces.IGraphPrintPresentation;
import interfaces.IVertex;

public class RowGraphPrintPresentation<V, E> implements IGraphPrintPresentation<V, E> {

	@Override
	public String mountGrafoToMessage(IGraph<V, E> graph) {
		String message = "";
		
		for (IVertex<?> iVertex : graph.getAllVertex()) {

			message += String.format("(%s)[%s] => {", iVertex.toString(), iVertex.getData());

			for (IEdge<?> iEdge : iVertex.getAllEdge()) {

				message += String.format(" (%s)[%s]", iEdge.getDestination(), iEdge.getData());

			}
			message += " }\n";
		}
		return message;
	}

}
