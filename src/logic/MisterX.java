package logic;

import java.util.ArrayList;

public class MisterX extends PlayerCharacter {
    private int blackTicketCount;
    private int doubleTicketCount;
    private ArrayList<MoveType> presentMoves;
    private int wasDoubleTicket = 0;

    public int getBlackTicketCount() {
        return blackTicketCount;
    }

    public int getDoubleTicketCount() {
        return doubleTicketCount;
    }

    public ArrayList<MoveType> getPresentMoves() {
        return presentMoves;
    }


    public boolean moveTaxi(Station station) {
        if (!position.getTaxiConnections().contains(station))
            return false;
        position = station;
        presentMoves.add(MoveType.Taxi);
        if(wasDoubleTicket == 2) {
            GameManager.nextRound();

        }
        wasDoubleTicket--;
        return true;
    }

    public boolean moveBus(Station station) {
        if (!position.getBusConnections().contains(station))
            return false;
        position = station;
        presentMoves.add(MoveType.Bus);
        if(wasDoubleTicket == 2) {
            GameManager.nextRound();

        }
        wasDoubleTicket--;
        return true;
    }

    public boolean moveUnderground(Station station) {
        if (!position.getUndergroundConnections().contains(station))
            return false;
        position = station;
        presentMoves.add(MoveType.Underground);
        if(wasDoubleTicket == 2) {
            GameManager.nextRound();

        }
        wasDoubleTicket--;
        return true;
    }

    public boolean moveBlackTicket(Station station) {
        if (!position.getAllConnections().contains(station))
            return false;
        blackTicketCount--;
        position = station;
        presentMoves.add(MoveType.Black);
        if(wasDoubleTicket == 2) {
            GameManager.nextRound();

        }
        wasDoubleTicket--;
        return true;
    }

    public boolean doubleTicket() {
        if (doubleTicketCount <= 0 || wasDoubleTicket >= 1)
            return false;
        doubleTicketCount--;
        wasDoubleTicket = 2;
        return true;

        /**
         * TODO: blackTicketSetzen(), doppelzugTicketSetzen(), ?( bewegen() )
         */
    }
}
