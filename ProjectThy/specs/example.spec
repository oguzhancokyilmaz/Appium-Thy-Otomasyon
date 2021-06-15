Specification Heading
=====================

This is an executable specification file. This file follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.

To execute this specification, run
	gauge specs

Permission
----------------
* İzin reddet
* "com.turkishairlines.mobile:id/acMain_btnBooking" id li elemente tıkla "Bilet Al"
* "com.turkishairlines.mobile:id/frDashboard_tvOneWay" id li elemente tıkla "Tek Yon"
* "com.turkishairlines.mobile:id/frDashboard_llFrom" id li elemente tıkla "Nereden"
* "com.android.packageinstaller:id/permission_deny_button" id li elemente tıkla "Izin Reddet"
* "com.turkishairlines.mobile:id/frAirportSelection_etSearch" id li elemente "SAW" değerini yaz "SAW"
* "//*[@text=\"SAW - Sabiha Gokcen Airport\"]" xpath elementine tıkla "SAW"
* "com.turkishairlines.mobile:id/frDashboard_llTo" id li elemente tıkla "Nereye"
* "com.turkishairlines.mobile:id/frAirportSelection_etSearch" id li elemente "ESB" değerini yaz "ESB"
* "//*[@text=\"ESB - Ankara Esenboga Airport\"]" xpath elementine tıkla "ESB"
* "2" saniye bekle
* "//*[@text=\"5\"]" xpath elementine tıkla "Yolcu Sayisi Artir"
* "2" saniye bekle
* "com.turkishairlines.mobile:id/frDashboard_rlDeparture" id li elemente tıkla "Tarih"
* rezervasyon yap
* "com.turkishairlines.mobile:id/frDashboard_btnDone" id li elemente tıkla "Tarih onaylama butonu"
* "com.turkishairlines.mobile:id/frDashboard_btnSearch" id li elemente tıkla "Ucus ara"
* Uçuşlar listelendi mi
* Ekonomi Uçuş Seçildi
* "com.turkishairlines.mobile:id/frFlightSearch_btnContinue" id li elemente tıkla "Ucus-Ekonomi Devam"


