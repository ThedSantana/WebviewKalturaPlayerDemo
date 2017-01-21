###WebviewKalturaPlayerDemo

Project properties

```sh
min sdk version: API 22: Android 5.1 (Lollipop)
screen orientation: landscape
theme: Full Screen
```

Preparing Kaltura Player script

Kaltura Player script can be generated on site:

<http://kaltura.github.io/EmbedCodeGenerator/demo/>

Parameters (for example):

```sh
Secured Host: cdnapisec.kaltura.com
Protocol: HTTPS
Embed Type: Auto Embed
Partner Id: 346
UiConf Id: 36784651
Entry Id: 1_cnbc1iqr
Width:470
Height:270
```

After generation put generated code in webview.htm

```sh
<html>
<meta name="viewport" content="width=480">
<body bgcolor="#000000">
<script src="https://cdnapisec.kaltura.com/p/346/sp/34600/embedIframeJs/uiconf_id/36784651/partner_id/346?autoembed=true&entry_id=1_cnbc1iqr&playerId=kaltura_player_1482881922&width=470&height=280"></script>
</body>
</html>
```