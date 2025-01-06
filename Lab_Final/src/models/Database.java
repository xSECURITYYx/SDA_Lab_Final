package models;

public class Database {
    public void save(Object entity) {
        System.out.println("Entity saved: " + entity);
    }

    public void update(Object entity) {
        System.out.println("Entity updated: " + entity);
    }

    public Object fetch(String query) {
        System.out.println("Fetching with query: " + query);
        return new Object();
    }

    public void delete(String entityId) {
        System.out.println("Entity deleted with ID: " + entityId);
    }
}
