export function parseViewModelDataAsJson(svelteElement: HTMLElement){
    let data = svelteElement.dataset['propViewModel'];
    if(!data) return undefined;
    return JSON.parse(data);
}