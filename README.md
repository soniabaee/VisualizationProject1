# Sonia2016.github.io

I try to visualize the unemployment of US states from 1978 - 2016.

We have US map and time-series chart that show unemployment rates related to each states of US.
It also shows the national rate and sudden decrease (more than 3%) in this duration.

1- Data processing
    retreiving data from BLS website.
      writing a htmlparser program in java for doing that.
    pre-processing data with R-script.
      creating data for each states according to timeseries duration
        - Collect the data from BLS website. Some pre-processing might be needed to obtain unemployment rate.
        - Allow users to select a state and display its unemployment rate in the graph. (select in map and draw button)
        - Allow user to add more than one states (to compare) or all states into the graph.
        - Graph labels are available and easy to read.
        - Display and compare to the national unemployment rate on request.
        - Allow state selection from a US map.
        - Highlight a state on the map when mousing over a time series.
        - Your visualization is responsive.
        - Allow users to quickly zoom into a time interval.
2- Data interpretation
        - Compare unemployment rate to other variables (that you think it is useful) on BLS website or other resources. 
        - Find some interesting events in the data and highlight them on my presentation file.

3- extra credits, you may want to:
        - Plot a time series with requested features on the graph, such as a sudden drop or pump.

