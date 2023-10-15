[#ftl]

<!DOCTYPE html>
<html lang="cs">
<head>
    [#include '/_common/head.ftlh']
</head>
<body>

<div class="container">
    [#include '/_common/header.ftlh']
    <div class="card" style="width: 18rem;">
        <div class="card-body">
            <h5 class="card-title">${ucastnik.jmeno} ${ucastnik.prijmeni}</h5>
            [#if ucastnik.bydliste??]
                <p class="card-text">${ucastnik.bydliste}</p>
            [/#if]
        </div>
    </div>
</div>
</body>
</html>
