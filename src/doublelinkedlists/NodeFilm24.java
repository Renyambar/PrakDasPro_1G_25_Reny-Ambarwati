package doublelinkedlists;

public class NodeFilm24 {
    Film24 data;
    NodeFilm24 next, prev; 

    public NodeFilm24(NodeFilm24 prev, Film24 data, NodeFilm24 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
