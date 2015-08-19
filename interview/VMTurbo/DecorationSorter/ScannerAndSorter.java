package VMTurbo.DecorationSorter;

interface ScannerAndSorter {
    // Read and scan another item; return false when there are no more
    // items.
    boolean nextItem();

    // Percentage (0-100) of the current item that's red.
    double redPercentage();

    // Percentage (0-100) of the current item that's green..
    double greenPercentage();

    // Send the current item to the Red bin
    void sendToRed();

    // Send the current item to the Green bin
    void sendToGreen();

    // Send the current item to the Reject bin
    void reject();
}
