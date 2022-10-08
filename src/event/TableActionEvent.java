package event;

public interface TableActionEvent {

    public void onDelete(int row);

    public void onUpdate(int row);
}
