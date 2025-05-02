package Products;

public interface Observer {
    // Why We Are Making This Interface because there can be multiple observer like user observer , warehouse observer
    void update(Products p);
}
