export function parseViewModelDataAsJson(svelteElement: HTMLElement){
    let data = svelteElement.dataset['propViewModel'];
    if(!data) return undefined;
    return JSON.parse(data);
}

export function parseCsrfTokenValue(svelteElement: HTMLElement){
    return svelteElement.dataset['propCsrfToken'];
}