package VMTurbo.DecorationSorter;

class DecorationSorter {
    ScannerAndSorter sorter;

    public DecorationSorter(ScannerAndSorter sorter) {
    	this.sorter = sorter;
    }

    // Sort the decorations that 'sorter' reads.
    public void sort(){
    	while(sorter.nextItem()){
	    	if(sorter.redPercentage()>0.35 && sorter.greenPercentage()>0.3)
	    		sorter.reject();
	    	else if(sorter.redPercentage()>0.35)
	    		sorter.sendToRed();
	    	else if(sorter.greenPercentage()>0.30)
	    		sorter.sendToGreen();
    	}
    }
}
