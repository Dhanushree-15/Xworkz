package com.xworkz.electric;

public class Main {
    public static void main(String[] args) {
        Lens lens = new Lens("Optical Zoom", 10);
        Lamp lamp = new Lamp(200, "Philips");
        Port port = new Port("HDMI", 2);
        Wire wire = new Wire("Copper", 3);
        Board board = new Board("X123", "Sony");
        Button button = new Button("Round", "Power");
        Panel panel = new Panel("Plastic", "Black");
        Remote remote = new Remote(12, "AA");
        Screw screw = new Screw("Phillips Head", 5);

        Projector projector = new Projector(lens, lamp);

        // Display details
        projector.displayInfo();
        lens.showLensDetails();
        lamp.showLampDetails();
        port.showPortDetails();
        wire.showWireDetails();
        board.showBoardDetails();
        button.showButtonDetails();
        panel.showPanelDetails();
        remote.showRemoteDetails();
        screw.showScrewDetails();
    }
}
