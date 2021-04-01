let link = localStorage["contact-data-link"];

$(function(){
    $.getJSON(link, displayContactData);
});

function displayContactData(contact) {
    console.log(contact);
    $("#fullName").text(contact.contactFullName);
    $("#jobType").text(contact.jobType);
    $("#phoneNumber").text(contact.phoneNumber);
    $("#address").text(contact.contactAddress);
    $("#email").text(contact.contactEmail);
}
