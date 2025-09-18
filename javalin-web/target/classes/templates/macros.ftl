<#macro card name email phone>
    <ul class="contact">
        <li class="name">${name}</li>
        <div class="contact-data">
        <li><img src="images/mail.svg" class="icon">${email}</li>
        <li><img src="images/phone.svg" class="icon">${phone}</li>
        </div>
    </ul>
</#macro>