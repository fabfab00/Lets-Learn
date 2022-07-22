<i class="icona-coachmarks" onclick="OpenCoachmark()" id = "Open-Coachmark"><%@include file="/Immagini/Coachmarks.svg"%></i>
<i class="icona-coachmarks" onclick="CloseCoachmark()" id = "Close-Coachmark" style="display: none"><%@include file="/Immagini/CoachmarksOff.svg"%></i>

<script>
    function OpenCoachmark()
    {
        document.getElementById("img").style.display="flex"
        document.getElementById("Open-Coachmark").style.display="none"
        document.getElementById("Close-Coachmark").style.display="flex"
    }

    function CloseCoachmark()
    {
        document.getElementById("img").style.display="none"
        document.getElementById("Open-Coachmark").style.display="flex"
        document.getElementById("Close-Coachmark").style.display="none"
    }
</script>