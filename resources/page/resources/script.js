$(document).ready(function() {
    /*$('.gallery img').each(function() {
        console.debug(this);
        $(this).wrap('<a href="' + this.src + '"></a>');
    });*/
    $('.gallery > img').simpleLightbox({
        sourceAttr: 'src'
    });
});
