package reservationsystem;
/**
 * @author DSharma
 * @author RSharma
 */
public class ReservationSystem {
    protected String vehicle_type;
    protected int seats[];
    
    public ReservationSystem(String s) {
       vehicle_type = s;       
    }
    
    public void seat_capacity(int size) {
        seats = new int[size];
        for (int i = 0; i < size; i++)
            seats[i] = 0;
    }
    
    public void assignSeat(int n) throws ArrayIndexOutOfBoundsException {
        if(n > seats.length) throw new ArrayIndexOutOfBoundsException();
        if(seats[n-1] == 0)
            seats[n-1] = 1;
        else
            System.out.println("Seat is already assigned");
        
    }
    
}
