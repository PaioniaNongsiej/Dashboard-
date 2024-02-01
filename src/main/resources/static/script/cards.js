 document.addEventListener("DOMContentLoaded", function() {
		    
		        var typeDropdown = document.getElementById("typeDropdown");
		        var yearDropdown = document.getElementById("yearDropdown");
		        var monthDropdown = document.getElementById("monthDropdown");

		        typeDropdown.addEventListener("change", function () {
		            
					
		            $("#typeDropdown, #yearDropdown, #monthDropdown").change(function () {
		            	debugger;
		                if ($("#typeDropdown").val() === "cformRequest") {
		                    var month = $("#monthDropdown").val();
		                    var year = $("#yearDropdown").val();

		                    console.log("years");

		                    $.ajax({
		                        type: "GET",
		                        url: "/Index/getCountForCform",
		                        data: {
		                            month: month,
		                            year: year
		                        },
		                        success: function (count) {
		                            // Display the count in the UI
		                            var vatRcCountElement = document.getElementById("vatRcCount");
		                            vatRcCountElement.innerHTML = "Number of cform request:" + count;

		                            // Show the card when the condition is met
		                            $("#cformCard").show();
		                            $("#dealerCard").hide();
		                            
		                        },
		                        error: function (error) {
		                            console.error("Error fetching count:", error);
		                        }
		                    });
		                }
		                else if ($("#typeDropdown").val() === "dealer") {
		                	var month = $("#monthDropdown").val();
		                    var year = $("#yearDropdown").val();

		                    console.log("years");
		                    
		                    $.ajax({
		                        type: "GET",
		                        url: "/Index/getCountForDealer",
		                        data: {
		                            month: month,
		                            year: year
		                        },
		                        success: function (count) {
		                            // Display the count in the UI
		                            var dealerCountElement = document.getElementById("dealerCount");
		                            dealerCountElement.innerHTML = count;
		                            
		                            $("#CountcurrentMonth").hide();
		                            $("#dealerCard").show();
		                              $("#cformCard").show();
		                            $("#countvatCancelledByMonth").hide();
		                        },
		                        error: function (error) {
		                            console.error("Error fetching count:", error);
		                        }
		                    });
		                    
		                } else {
		                    // If the condition is not met, hide the card
		                    $("#cformCard").hide();
		                    $("#dealerCard").hide();
		                }
		            });
		            
		            yearDropdown.innerHTML = "";
		            var defaultOptionYear = document.createElement("option");
		            defaultOptionYear.text = "Select Year";
		            yearDropdown.add(defaultOptionYear);
					
		            
		            if (typeDropdown.value === "cformRequest") {
		               // Make an AJAX request to fetch cform years
		                $.ajax({
		                    type: "GET",
		                    url: "/Index/getYearsForCform",
		                    success: function (data) {
		                        data.forEach(function (year) {
		                            var option = document.createElement("option");
		                            option.text = year;
		                            yearDropdown.add(option);
		                        });
		                    },
		                    error: function (error) {
		                        console.error("Error fetching years:", error);
		                    }
		                });

		               
		            }
		            
		            if (typeDropdown.value === "dealer") {
		                // Make an AJAX request to fetch dealer years
		                $.ajax({
		                    type: "GET",
		                    url: "/Index/getYearsForRegdDealer",
		                    success: function (data) {
		                        data.forEach(function (year) {
		                            var option = document.createElement("option");
		                            option.text = year;
		                            yearDropdown.add(option);
		                        });
		                    },
		                    error: function (error) {
		                        console.error("Error fetching years:", error);
		                    }
		                });
		            }
		            
		            if (typeDropdown.value === "cformIssued") {
		                // Make an AJAX request to fetch Cform issued years
		                $.ajax({
		                    type: "GET",
		                    url: "/Index/getYearsForCformIssued",
		                    success: function (data) {
		                        data.forEach(function (year) {
		                            var option = document.createElement("option");
		                            option.text = year;
		                            yearDropdown.add(option);
		                        });
		                    },
		                    error: function (error) {
		                        console.error("Error fetching years:", error);
		                    }
		                });
		            }
		            
		            if (typeDropdown.value === "invoice") {
		                // Make an AJAX request to fetch Cform issued years
		                $.ajax({
		                    type: "GET",
		                    url: "/Index/getYearsForInvoice",
		                    success: function (data) {
		                        data.forEach(function (year) {
		                            var option = document.createElement("option");
		                            option.text = year;
		                            yearDropdown.add(option);
		                        });
		                    },
		                    error: function (error) {
		                        console.error("Error fetching years:", error);
		                    }
		                });
		            }
		            //add more if needed
		        });
		    });